package com.springindepth.vote;

public class VotingBooth {

//    VoteRecorder voteRecorder = new VoteRecorder();

//    public void vote(Candidate candidate) {
//        voteRecorder.record(candidate);
//    }
//
//    class VoteRecorder {
//        Map<Candidate, Integer> hVotes = new HashMap();
//
//        public void record(Candidate candidate) {
//            int count = 0;
//
//            if (!hVotes.containsKey(candidate)){
//                hVotes.put(candidate, count);
//            } else {
//                count = hVotes.get(candidate);
//            }
//
//            count++;
//
//            hVotes.put(candidate, count);
//
//        }
//    }


    VoteRecorder recorder = null;

    /*public VotingBooth(VoteRecorder recorder) {
        this.recorder = recorder;
    }*/

    /*public VotingBooth() {
        this.recorder = new LocalVoteRecorder();
    }*/

    public void setVoteRecorder(VoteRecorder recorder) {
        this.recorder = recorder;
    }

    public VoteRecorder getVoteRecorder() {
        return recorder;
    }

    public void vote(Candidate candidate) {
        recorder.record(candidate);
    }
}
