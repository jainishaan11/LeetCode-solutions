#include <stdbool.h>

bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
    struct TreeNode* queue[20000];
    int front = 0, rear = 0;

    queue[rear++] = p;
    queue[rear++] = q;

    while (front < rear) {
        struct TreeNode* a = queue[front++];
        struct TreeNode* b = queue[front++];

        if (a == NULL && b == NULL)
            continue;

        if (a == NULL || b == NULL || a->val != b->val)
            return false;

        queue[rear++] = a->left;
        queue[rear++] = b->left;
        queue[rear++] = a->right;
        queue[rear++] = b->right;
    }

    return true;
}