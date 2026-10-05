class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {

            TreeNode a = queue.poll();
            TreeNode b = queue.poll();

            // Both null → continue
            if (a == null && b == null)
                continue;

            // One null or values different → not same
            if (a == null || b == null || a.val != b.val)
                return false;

            // Add corresponding children
            queue.add(a.left);
            queue.add(b.left);

            queue.add(a.right);
            queue.add(b.right);
        }

        return true;
    }
}