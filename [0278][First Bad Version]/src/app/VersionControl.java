package app;

public class VersionControl {
    int[] versions;
    public VersionControl(int n, int v) {
        this.versions = new int[n];
        for(int i = 0; i < v; i++) {
            versions[i] = 1;
        }
    }
    public boolean isBadVersion(int n) {
        return versions[n] == 0 ? true : false;
    }
}