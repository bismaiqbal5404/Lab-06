
package group.lab_06_ex_03;


import java.util.ArrayList;
import java.util.List;



class Library{
    private String libraryName;
    private List<LB> branches;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        branches.add(new LB(branchName));
        System.out.println("Branch added: " + branchName);
    }

    public LB getBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return branches.get(i);
            }
        }
        System.out.println("Branch " + branchName + " not found.");
        return null;
    }

    public void displayAllBranches() {
        System.out.println("Branches in " + libraryName + ":");
        for (int i = 0; i < branches.size(); i++) {
            System.out.println(branches.get(i).getBranchName());
        }
    }
}

