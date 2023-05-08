package huawei;

import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<String, VoteName> voteNameHashMap = new HashMap<>();

        String[] names = input.split(",");
        for (String name : names) {
            if (voteNameHashMap.containsKey(name)) {
                voteNameHashMap.get(name).vote++;
            } else {
                voteNameHashMap.put(name, new VoteName(name, 1L));
            }
        }
        List<VoteName> voteNameArrayList = new ArrayList<>();
        voteNameHashMap.forEach(
                (s, voteName) -> voteNameArrayList.add(voteName)
        );
        voteNameArrayList.sort((o1, o2) -> {
            if (o1.vote > o2.vote) {
                return -1;
            } else if (o1.vote < o2.vote) {
                return 1;
            } else {
                return compareString(o1.name, o2.name);
            }
        });
        for (VoteName voteName : voteNameArrayList) {
            System.out.print(voteName.name + " " + voteName.vote.toString());
        }
    }

    static int compareString(String o1, String o2) {
        int length = Math.min(o1.length(), o2.length());
        char[] o1Char = o1.toCharArray();
        char[] o2Char = o2.toCharArray();
        for (int i = 0; i < length; i++) {
            if (o1Char[i] < o2Char[i]) {
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}

class VoteName {
    String name;
    Long vote;

    VoteName(String name, Long vote) {
        this.name = name;
        this.vote = vote;
    }
}
