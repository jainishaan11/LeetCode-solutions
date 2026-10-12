typedef struct {
    int og[100];
    int xtra[100];
    int top1;
    int top2;
} MyQueue;

MyQueue* myQueueCreate() {
    MyQueue* obj = (MyQueue*)malloc(sizeof(MyQueue));
    obj->top1 = -1;
    obj->top2 = -1;
    return obj;
}

void myQueuePush(MyQueue* obj, int x) {
    obj->og[++obj->top1] = x;
}

int myQueuePop(MyQueue* obj) {
    while (obj->top1 != -1) {
        obj->xtra[++obj->top2] = obj->og[obj->top1--];
    }

    int x = obj->xtra[obj->top2--];

    while (obj->top2 != -1) {
        obj->og[++obj->top1] = obj->xtra[obj->top2--];
    }

    return x;
}

int myQueuePeek(MyQueue* obj) {
    while (obj->top1 != -1) {
        obj->xtra[++obj->top2] = obj->og[obj->top1--];
    }

    int x = obj->xtra[obj->top2];

    while (obj->top2 != -1) {
        obj->og[++obj->top1] = obj->xtra[obj->top2--];
    }

    return x;
}

bool myQueueEmpty(MyQueue* obj) {
    return obj->top1 == -1;
}

void myQueueFree(MyQueue* obj) {
    free(obj);
}