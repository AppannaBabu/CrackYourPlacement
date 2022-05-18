# geeksforgeeks PROBLEM LINK: https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1/#
class Solution:

    def findMinDiff(self, A,N,M):
        # code here
        A.sort()
        md=A[M-1]-A[0]
        for i in(range(N-M+1)):
            if md > A[i+M-1]-A[i]:
                md=A[i+M-1]-A[i]
        return md