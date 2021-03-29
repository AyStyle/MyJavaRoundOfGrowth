package ankang.algorithm;

import java.util.*;

/**
 * @author: ankang
 * @email: dreedisgood@qq.com
 * @create: 2021-01-18
 */
public class AccountMerge731 {

    /**
     * 给定一个列表 accounts，每个元素 accounts[i] 是一个字符串列表，其中第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该账户的邮箱地址。
     * 现在，我们想合并这些账户。如果两个账户都有一些共同的邮箱地址，则两个账户必定属于同一个人。请注意，即使两个账户具有相同的名称，它们也可能属于不同的人，因为人们可能具有相同的名称。一个人最初可以拥有任意数量的账户，但其所有账户都具有相同的名称。
     * 合并账户后，按以下格式返回账户：每个账户的第一个元素是名称，其余元素是按字符 ASCII 顺序排列的邮箱地址。账户本身可以以任意顺序返回。
     * <p>
     * 输入：
     * accounts = [["John", "johnsmith@mail.com", "john00@mail.com"], ["John", "johnnybravo@mail.com"], ["John", "johnsmith@mail.com", "john_newyork@mail.com"], ["Mary", "mary@mail.com"]]
     * 输出：
     * [["John", 'john00@mail.com', 'john_newyork@mail.com', 'johnsmith@mail.com'],  ["John", "johnnybravo@mail.com"], ["Mary", "mary@mail.com"]]
     * 解释：
     * 第一个和第三个 John 是同一个人，因为他们有共同的邮箱地址 "johnsmith@mail.com"。
     * 第二个 John 和 Mary 是不同的人，因为他们的邮箱地址没有被其他帐户使用。
     * 可以以任何顺序返回这些列表，例如答案 [['Mary'，'mary@mail.com']，['John'，'johnnybravo@mail.com']，
     * ['John'，'john00@mail.com'，'john_newyork@mail.com'，'johnsmith@mail.com']] 也是正确的。
     *
     * @param accounts
     * @return
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        final List<List<String>> result = new ArrayList<>();
        for (int i = 0 ; i < accounts.size() ; i++) {
            for (int j = i + 1 ; j < accounts.size() ; j++) {
                merge(accounts.get(i) , accounts.get(j));
            }
            if (!accounts.get(i).isEmpty()) {
                final HashSet<String> set = new HashSet<>(accounts.get(i));
                final ArrayList<String> list = new ArrayList<>(set);
                list.sort(Comparator.naturalOrder());
                result.add(list);
            }
        }

        return result;
    }

    private void merge(List<String> a , List<String> b) {
        if (!a.isEmpty() && !b.isEmpty() && a.get(0).equals(b.get(0))) {
            final String remove = b.remove(0);
            if (!Collections.disjoint(a , b)) {
                a.addAll(b);
                b.clear();
            } else {
                b.add(0 , remove);
            }
        }
    }

}
