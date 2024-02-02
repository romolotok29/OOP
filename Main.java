public class Main {
    public static void main(String[] args) {

        Custom<Integer> customList = new Custom<>(12);

        customList.add(18);
        customList.add(5);
        customList.add(8);
        customList.add(4);
        customList.add(7);
        customList.add(10);
        customList.add(11);
        customList.add(3);
        customList.add(9);
        customList.add(22);
        customList.add(6);
        customList.add(20);

        customList.ensureCapacity();

        customList.add(15);

        System.out.println("Size: " + customList.size());
        System.out.println("Getting first element : " + customList.get(0));

        customList.delete(1);

        System.out.println("Check if contains 5 after removal: " + customList.contains(1));
        System.out.println("Size after removal: " + customList.size());

        customList.clear();
        System.out.println("Size after clear: " + customList.size());
    }
}