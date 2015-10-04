package com.springindepth.vote;

import java.util.HashMap;
import java.util.Map;

public class LocalVoteRecorder implements VoteRecorder {

    Map<Candidate, Integer> hVotes = new HashMap();

    @Override
    public void record(Candidate candidate) {
        int count = 0;

        if (!hVotes.containsKey(candidate)){
            hVotes.put(candidate, count);
        } else {
            count = hVotes.get(candidate);
        }

        count++;

        hVotes.put(candidate, count);
    }

    @Override
    public int result(Candidate candidate) {
        return hVotes.get(candidate);
    }
}
