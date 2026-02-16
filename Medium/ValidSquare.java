void main() {
    int[] p1={1,0},p2={-1,0},p3={0,1},p4={0,-1};
    System.out.println(validSquare(p1,p2,p3,p4));

} public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

    Set<Long> set = new HashSet<>();

    set.add(dist(p1, p2));
    set.add(dist(p1, p3));
    set.add(dist(p1, p4));
    set.add(dist(p2, p3));
    set.add(dist(p2, p4));
    set.add(dist(p3, p4));

    // For square, there must be exactly 2 unique distances:
    // one for sides and one for diagonals
    // Also none should be zero
    return !set.contains(0L) && set.size() == 2;
}

private long dist(int[] a, int[] b) {
    long dx = a[0] - b[0];
    long dy = a[1] - b[1];
    return dx * dx + dy * dy;
}