package ankang.algorithm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class AccountMerge731Test {

    @Test
    void testMergeAccount() {
        final AccountMerge731 accountMerge731 = new AccountMerge731();
        final List<String> l1 = new ArrayList<>(Arrays.asList("David" , "David0@m.co" , "David4@m.co" , "David3@m.co"));
        final List<String> l2 = new ArrayList<>(Arrays.asList("David" , "David5@m.co" , "David5@m.co" , "David0@m.co"));
        final List<String> l3 = new ArrayList<>(Arrays.asList("David" , "David1@m.co" , "David4@m.co" , "David0@m.co"));
        final List<String> l4 = new ArrayList<>(Arrays.asList("David" , "David0@m.co" , "David1@m.co" , "David3@m.co"));
        final List<String> l5 = new ArrayList<>(Arrays.asList("David" , "David4@m.co" , "David1@m.co" , "David3@m.co"));

        final List<List<String>> lists = Arrays.asList(l1 , l2 , l3 , l4 , l5);

        final List<List<String>> result = accountMerge731.accountsMerge(lists);

        System.out.println(result);
    }

}