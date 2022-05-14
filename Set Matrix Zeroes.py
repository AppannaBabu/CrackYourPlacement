# LeetCode problem link: https://leetcode.com/problems/set-matrix-zeroes/
class Solution(object):
    def make_zero(self,matrix,i,j,lr,lc):
        row,col=0,0
        while row<lr:
            matrix[row][j]=0
            row+=1
        while col<lc:
            matrix[i][col]=0
            col+=1
        return matrix
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        lr=len(matrix)
        lc=len(matrix[0])
        r_matrix=matrix+[[]]
        lst=[]
        i=0;
        while i<lr:
            j=0
            while j<lc:
                if matrix[i][j]==0:
                    lst.append([i,j])
                j+=1
            i+=1
        for i in lst:
            matrix=self.make_zero(matrix,i[0],i[1],lr,lc)
        return matrix