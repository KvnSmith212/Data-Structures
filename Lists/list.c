#include "list.h"

node* create_node(void data){
	node* n = malloc(sizeof(*n));
	n->data = *data;
	n->next = NULL;

	return n;
}

void insert(node** list, void data){
	if (!(**list)){
		*list = create_node(data);
	}
	else{
		node* node = create_node(data);
		node->next = list;
		list* = node;
	}
}

bool delete(node** list, void data){
	if (!(**list)){
		return false;
	}
	else if ((*list)->data == data){
		node temp = **list;
		*list = (*list)->next;
		free(temp);
		return true;
	}
	else{
		node** curr = list;
		while ((*curr)->next){
			if ((*curr)->next->data == data){
				node temp = (*curr)->next;
				(*curr)->next = (*curr)->next->next;
				free(temp);
				return true;
			}
			else{
				curr = &((*curr)->next);
			}
		}
	}

	return false;
}

void clear(node* list){
	node* curr = list;
	while (*curr){
		list = curr;
		curr = curr->next;
		free(*list);
	}
}
