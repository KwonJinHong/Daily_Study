# Java Study - [알고리즘] DFS (Depth-First-Search)

## 1. DFS (Depth-First-Search) 란?

깊이 우선 탐색 (DFS)는 루트 노드나 임의의 노드에서 시작하여 최대한 깊숙히 들어가서 탐색한 후 다시 원점으로 돌아가 다른 루트로 탐색하는 방법을 말한다.

일반적으로 재귀호출을 사용하여 구현하지만, 단순한 스택이나 인접 행렬, 인접 리스트를 이용하여 구현하기도 한다. (스택을 사용할 경우, 오버플로우에 유의)

DFS 는 자동 미로 생성 또는 자동 미로 탐색에 사용되는데 아래와 같은 특징이 있다.
-  미로 탐색시, 한 방향으로 갈 수 있을때까지 계속 탐색
-  넓게 탐색하기 전에, 깊게 탐색함
-  모든 노드를 방문하고자 할 때 사용
-  노드 방문 여부를 반드시 검사해야함 (하지 않을 시 무한루프에 빠짐)
-  자기 자신을 호출하는 순환 알고리즘의 형태 (재귀호출)
---
## 2. DFS의 장단점

### 장점 
-  구현이 너비 우선 탐색 (BFS)보다 간단하다.
-  현재 경로상의 노드들만 기억하면 되므로, 저장 공간의 수요가 비교적 적다.
-  목표 노드가 깊은 단계에 있는 경우 해를 빨리 구할 수 있다.

### 단점
-  단순 검색 속도는 너비 우선 탐색 (BFS)보다 느리다.
-  해가 없는 경우에 빠질 가능성이 존재 (이러한 경우 사전에 임의의 깊이를 지정한 후 탐색하도록 하고, 목표 노드를 발견하지 못할 경우 다음 경로로 탐색하도록 함)
-  깊이 우선 탐색은 해를 구하면 탐색이 종료되므로, 구한 해가 최단 경로가 된다는 보장이 없다. (목표에 이르는 경로가 다수인 경우 구한 해가 최적이 아닐 수 있다.)
---
## 3. 코드로 구현

### 3.1 재귀(Recursion)형태로 구현
```java
public class DFS_Recursion {
 
	// 방문처리에 사용 할 배열선언
	static boolean[] vistied = new boolean[9];
	
	// 그림예시 그래프의 연결상태를 2차원 배열로 표현
	// 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	public static void main(String[] args) {
		dfs(1);
	}
	
	static void dfs(int nodeIndex) {
		// 방문 처리
		visited[nodeIndex] = true;
		
		// 방문 노드 출력
		System.out.print(nodeIndex + " -> ");
		
		// 방문한 노드에 인접한 노드 찾기
		for (int node : graph[nodeIndex]) {
			// 인접한 노드가 방문한 적이 없다면 DFS 수행
			if(!visited[node]) {
				dfs(node);
			}
		}
	}
}
```

### 3.2 Stack 사용으로 구현

```java
import java.util.Stack;
 
public class DFS_stack {
 
	// 방문처리에 사용 할 배열선언
	static boolean[] vistied = new boolean[9];
	
	// 그림예시 그래프의 연결상태를 2차원 배열로 표현
	// 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	// DFS 사용 할 스택
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) {
		
		// 시작 노드를 스택에 넣어줍니다.
		stack.push(1);
		// 시작 노드 방문처리
		visited[1] = true;
		
		// 스택이 비어있지 않으면 계속 반복
		while(!stack.isEmpty()) {
			
			// 스택에서 하나를 꺼냅니다.
			int nodeIndex = stack.pop();
			
			// 방문 노드 출력
			System.out.print(nodeIndex + " -> ");
			
			// 꺼낸 노드와 인접한 노드 찾기
			for (int LinkedNode : graph[nodeIndex]) {
				// 인접한 노드를 방문하지 않았을 경우에 스택에 넣고 방문처리 
				if(!vistied[LinkedNode]) {
					stack.push(LinkedNode);
					vistied[LinkedNode] = true;
				}
			}
		}
	}
}
```
