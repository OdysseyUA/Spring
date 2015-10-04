package com.springindepth.vote;

public class Driver {

    public static void main(String[] args) {
        Candidate candidate1 = new Candidate("George", "Bush");
        Candidate candidate2 = new Candidate("Bill", "Clinton");

        VoteRecorder voteRecorder = new LocalVoteRecorder();

        VotingBooth votingBooth = new VotingBooth();
//        VotingBooth votingBooth = new VotingBooth(new LocalVoteRecorder());
//        votingBooth.setVoteRecorder(new LocalVoteRecorder());

        votingBooth.setVoteRecorder(voteRecorder);

        votingBooth.vote(candidate1);
        votingBooth.vote(candidate2);
        votingBooth.vote(candidate2);
        votingBooth.vote(candidate2);

        System.out.println(candidate1.getFirstName() + " " + candidate1.getLastName() + " have "
                + votingBooth.getVoteRecorder().result(candidate1) + " votes.");

        System.out.println(candidate2.getFirstName() + " " + candidate2.getLastName() + " have "
                + votingBooth.getVoteRecorder().result(candidate2) + " votes.");
    }
}
