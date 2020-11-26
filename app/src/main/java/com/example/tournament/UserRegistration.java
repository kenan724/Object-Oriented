package com.example.tournament;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration implements Registration {

    public UserRegistration(Integer maxCount){
        this.maxCount = maxCount;
        participants = new ArrayList<User>();
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public void register(User user) {

    }

    @Override
    public void remove(User user) {

    }

    public boolean isFull(){
        return participants.size() == maxCount;
    }

    private Integer maxCount;
    private List<User> participants;
}
