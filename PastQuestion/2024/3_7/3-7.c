#include <stdio.h>

int func() {
	static int x = 0;	//static ������ �� ���� �ʱ�ȭ�ǰ�, �Լ��� ������ ���� ����
	x += 2;
	return x;
}

int main() {
	int x = 1;
	int sum = 0;
	for (int i = 0; i < 4; i++) {
		x++;
		sum += func();	//2�� ������
	}
	printf("%d", sum);
	return 0;
}