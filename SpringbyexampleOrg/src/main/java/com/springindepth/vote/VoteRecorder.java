package com.springindepth.vote;

public interface VoteRecorder {
    void record(Candidate candidate);
    int result(Candidate candidate);
}
