package com.leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Twitter {
	private static int timeStamp = 0;
	private Map<Integer,User> mUsers = null; 
	class User{
		private int mUserId;
		private Set<Integer> mFollows; 
		private Tweet mTweetHead;
		
		public User(int userId){
			mUserId = userId;
			mFollows = new HashSet<Integer>();
			mTweetHead = null;
		}
		
		public void follow(int userId){
			if(!mFollows.contains(userId)){
				mFollows.add(userId);
			}
		}
		
		public void unFollow(int userId){
			if(mFollows.contains(userId)){
				mFollows.remove(userId);
			}
		}
		
		public void post(int id){
			Tweet tweet = new Tweet(id);
			tweet.next = mTweetHead;
			mTweetHead = tweet;
		}
	}
	
	class Tweet{
		 int tweetId;
		 int time;
		 Tweet next;
		
		public Tweet(int id){
			tweetId = id;
			time = timeStamp++;
			next = null;
		}
	} 
	
    /** Initialize your data structure here. */
    public Twitter() {
    	mUsers = new HashMap<Integer,User>();
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if(!mUsers.containsKey(userId)){
        	User user = new User(userId);
        	mUsers.put(userId, user);
        }
        mUsers.get(userId).post(tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new LinkedList<Integer>();
        if(!mUsers.containsKey(userId))
        	return res;
        Set<Integer> users = mUsers.get(userId).mFollows;
        PriorityQueue<Tweet> q  = new PriorityQueue<Tweet>(mUsers.size(),new Comparator<Tweet>(){
			@Override
			public int compare(Tweet o1, Tweet o2) {
				return o2.time - o1.time;
			}
        });
        
        for(int user : users){
        	Tweet t = mUsers.get(user).mTweetHead;
        	if(t != null){
        		q.add(t);
        	}
        }
        if(mUsers.get(userId).mTweetHead != null){
        	q.add(mUsers.get(userId).mTweetHead);
        }
        int n = 0;
        while(!q.isEmpty() && n < 10){
        	Tweet t = q.poll();
        	res.add(t.tweetId);
        	n++;
        	if(t.next != null){
        		q.add(t.next);
        	}
        }
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!mUsers.containsKey(followerId)){
        	User user = new User(followerId);
        	mUsers.put(followerId, user);
        }
        
        if(!mUsers.containsKey(followeeId)){
        	User user = new User(followeeId);
        	mUsers.put(followeeId, user);
        }
        if(followerId == followeeId)
        	return;
        mUsers.get(followerId).follow(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!mUsers.containsKey(followerId) || followerId == followeeId)
        	return;
        mUsers.get(followerId).unFollow(followeeId);
    }
}
