package com.example.eyepetizer;

import org.litepal.crud.LitePalSupport;

import java.util.LinkedList;
import java.util.Queue;

public class User extends LitePalSupport {
    private String username;
    private String password;
    Queue<HistoryVideo> historyQueue = new LinkedList<HistoryVideo>();

    public Queue<HistoryVideo> getHistoryQueue() {
        return historyQueue;
    }

    public void setHistoryQueue(Queue<HistoryVideo> historyQueue) {
        this.historyQueue = historyQueue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
