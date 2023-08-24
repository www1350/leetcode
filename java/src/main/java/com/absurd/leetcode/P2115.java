package com.absurd.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Absurd
 * @version P2115.java, v 0.1 2023年08月24日 14:59 Absurd
 */
public class P2115 {
    /***
     * 你有 n 道不同菜的信息。给你一个字符串数组 recipes 和一个二维字符串数组 ingredients 。第 i 道菜的名字为 recipes[i] ，如果你有它 所有 的原材料 ingredients[i] ，那么你可以 做出 这道菜。一道菜的原材料可能是 另一道 菜，也就是说 ingredients[i] 可能包含 recipes 中另一个字符串。
     *
     * 同时给你一个字符串数组 supplies ，它包含你初始时拥有的所有原材料，每一种原材料你都有无限多。
     *
     * 请你返回你可以做出的所有菜。你可以以 任意顺序 返回它们。
     *
     * 注意两道菜在它们的原材料中可能互相包含。
     *
     * 示例 1：
     *
     * 输入：recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast","flour","corn"]
     * 输出：["bread"]
     * 解释：
     * 我们可以做出 "bread" ，因为我们有原材料 "yeast" 和 "flour" 。
     * 示例 2：
     *
     * 输入：recipes = ["bread","sandwich"], ingredients = [["yeast","flour"],["bread","meat"]], supplies = ["yeast","flour","meat"]
     * 输出：["bread","sandwich"]
     * 解释：
     * 我们可以做出 "bread" ，因为我们有原材料 "yeast" 和 "flour" 。
     * 我们可以做出 "sandwich" ，因为我们有原材料 "meat" 且可以做出原材料 "bread" 。
     * 示例 3：
     *
     * 输入：recipes = ["bread","sandwich","burger"], ingredients = [["yeast","flour"],["bread","meat"],["sandwich","meat","bread"]], supplies = ["yeast","flour","meat"]
     * 输出：["bread","sandwich","burger"]
     * 解释：
     * 我们可以做出 "bread" ，因为我们有原材料 "yeast" 和 "flour" 。
     * 我们可以做出 "sandwich" ，因为我们有原材料 "meat" 且可以做出原材料 "bread" 。
     * 我们可以做出 "burger" ，因为我们有原材料 "meat" 且可以做出原材料 "bread" 和 "sandwich" 。
     * 示例 4：
     *
     * 输入：recipes = ["bread"], ingredients = [["yeast","flour"]], supplies = ["yeast"]
     * 输出：[]
     * 解释：
     * 我们没法做出任何菜，因为我们只有原材料 "yeast" 。
     * 提示：
     *
     * n == recipes.length == ingredients.length
     * 1 <= n <= 100
     * 1 <= ingredients[i].length, supplies.length <= 100
     * 1 <= recipes[i].length, ingredients[i][j].length, supplies[k].length <= 10
     * recipes[i], ingredients[i][j] 和 supplies[k] 只包含小写英文字母。
     * 所有 recipes 和 supplies 中的值互不相同。
     * ingredients[i] 中的字符串互不相同。
     * @param recipes
     * @param ingredients
     * @param supplies
     * @return
     */
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        result = new HashSet<>();
        visit = new HashSet<>();
        suppliesSet = Arrays.stream(supplies).collect(Collectors.toSet());
        recipesMap = IntStream.range(0, recipes.length)
                .boxed()
                .collect(Collectors.toMap(i -> recipes[i], i -> ingredients.get(i)));

        for(int i =0;i<ingredients.size();i++){
            List<String> ingredientList = ingredients.get(i);
            isSuit(recipes[i], ingredientList);
        }
        return new ArrayList<>(result);
    }

    private static Set<String> result = new HashSet<>();

    private static Set<String> visit = new HashSet<>();

    private static Set<String> suppliesSet = new HashSet<>();

    private static Map<String, List<String>> recipesMap = new HashMap<>();

    private boolean isSuit(String recipe, List<String> ingredientList) {
        if (ingredientList.isEmpty()){
            return false;
        }
        // 是否这个食物访问过了，访问过的会死循环
        if (visit.contains(recipe)){
            return false;
        }
        visit.add(recipe);

        boolean isSuit = true;
        for(int j=0;j<ingredientList.size();j++){
            // 是材料
            if (suppliesSet.contains(ingredientList.get(j)) ){
                continue;
            }
            // 是可以做的食物
            if (result.contains(ingredientList.get(j))){
                continue;
            }

            // 是食物，递归去看这个食物可不可以做
            if (!isSuit(ingredientList.get(j), recipesMap.getOrDefault(ingredientList.get(j), new ArrayList<>()))){
                isSuit = false;
                break;
            }

        }
        if (isSuit){
            result.add(recipe);
        }
        return isSuit;
    }

}