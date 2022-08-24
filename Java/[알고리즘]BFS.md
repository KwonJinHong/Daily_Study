# Java Study - [알고리즘] BFS (Breadth-First-Search)
## 1. BFS (Breadth-First-Search) 란?
BFS 는 너비 우선 탐색으로 시작 정점을 지나고 나면 깊이가 1인 모든 정점을 방문하고, 그 다음에 깊이가 2인 모든 정점을 방문한다. 이런식으로 한 단계씩 깊이를 더해가며 해당 깊이에 존재하는 모든 정점들은 방문하다가 더 이상 방문할 곳이 없을 때 탐색을 종료한다.

BFS는 두 노드 사이의 최단 경로 혹은 임의의 경로를 찾고 싶을 때 사용하고, 특징은 아래와 같다.
-  BFS는 시작 정점으로부터 거리가 가까운 정점의 순서대로 탐핵한다.
-  그래프 탐색의 경우 어떤 노드를 방문했었는지 여부를 반드시 검사해야한다. (이를 검사하지 않을 경우 무한 루프에 빠질 위험이 있다.)
-  BFS는 재귀적으로 동작하지 않는다.
-  BFS는 방문한 노드들을 차례로 저장한 후 꺼낼 수 있는 자료 구조인 큐(Queue)를 사용한다. (즉, FIFO 원칙으로 탐색)
- 일반적으로 큐를 이용해서 반복적 형태로 구현하는 것이 가장 잘 동작한다.
---
## 2. BFS 장단점
### 장점
-  너비를 우선적으로 탐색하기 때문에 답이 되는 경로가 여러 개인 경우에도 최단 경로임을 보장한다.
-  최단 경로가 존재한다면, 어느 한 경로가 무한히 깊어진다 해도 최단 경로를 반드시 찾을 수 있다.
-  노드 수가 적고 깊이가 얕은 해가 존재 할 때 유리하다.

### 단점
- 재귀호출을 사용하는 DFS와는 달리 큐를 이용해 다음에 탐색 할 노드들을 저장하기 때문에 노드의 수가 많을 수록 필요없는 노드들까지 저장해야 하기 때문에 더 큰 저장공간이 필요하다.
- 노드의 수가 늘어나면 탐색해야하는 노드가 많아지기 대문에 비효율적이게 된다.
---

## 3. Java 코드로 구현
그래프의 표현이 인접 행렬인 경우와 인접 리스트인 경우로 나누어 구현
### 3.1 인접 리스트로 구현
```java
public static void bfs_list(int v, LinkedList<Integer>[] adjList, boolean[] visited) {
	Queue<Integer> queue = new LinkedList<Integer>();
	visited[v] = true; 
	queue.add(v);

	while(queue.size() != 0) { 
		v = queue.poll(); // 큐의 front에 있는 정점을 꺼낸다.
		System.out.print(v + " ");

		Iterator<Integer> iter = adjList[v].listIterator();
		while(iter.hasNext()) { 
			int w = iter.next(); 
			if(!visited[w]) { 
				visited[w] = true; // 방문한 정점 표시
				queue.add(w); // 큐에 방문한 정점 넣는다.
			} 
		}
	}
}
```
## 3.2 인접 행렬로 구현
```java
public static void bfs_array(int v, int[][] adjArray, boolean[] visited) {
	Queue<Integer> q = new LinkedList<>();
	int n = adjArray.length - 1;

	q.add(v);
	visited[v] = true;

	while (!q.isEmpty()) {
		v = q.poll();
		System.out.print(v + " ");

		for (int i = 1; i <= n; i++) {
			if (adjArray[v][i] == 1 && !visited[i]) {
				q.add(i);
				visited[i] = true;
			}
		}
	}
}
```

## 3.3 BFS 시간복잡도
정점의 수가 n이고, 간선의 수가 e인 그래프의 경우
-  그래프가 인접 리스트로 표현된 경우 O(n+e)
-  그래프가 인접 행렬로 표현된 경우 O(n^2)
---
