#include <stdlib.h>

typedef _node{
	void* data;
	struct _node* next;
} node;

node* create_node(void data);
void insert(node** list, void data);
bool delete(node** list, void data);
void clear(node* list);

