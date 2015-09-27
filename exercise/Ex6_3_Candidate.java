package exercise;

public class Ex6_3_Candidate {

	private String name;
	private Ex6_3_Vote vote;
	private int numberOfCandidates;
	
	public Ex6_3_Candidate(){
		this.name = "None";
		this.numberOfCandidates = 0;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", vote=" + vote.getCount() + "\n";
	}

	public Ex6_3_Candidate(String name, Ex6_3_Vote vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}
	public Ex6_3_Vote getVote() {
		return vote;
	}
	public int getNumberOfCandidates() {
		return numberOfCandidates;
	}
	
}
