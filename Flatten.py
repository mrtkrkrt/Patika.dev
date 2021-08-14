""" Bir listeyi düzleştiren (flatten) fonksiyon yazın. Elemanları birden çok katmanlı listtlerden ([[3],2] gibi) oluşabileceği gibi, non-scalar verilerden de oluşabilir"""

l_1 = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]
l_2 = [[[[[[1]], 2],"jsf"], 97], ["dfsd", 90238, [[2],3]]]

def flatten(listNormal):
    i = 0
    while True:
        
        if i == len(listNormal):
            break
        
        boolean = False
        if isinstance(listNormal[i], list):
            temp = listNormal[i]
            listNormal.remove(temp)
            count = 0
            for j in temp:
                listNormal.insert(i-count, j)
                if isinstance(j, list):
                    boolean = True
        
        if boolean:
            i = i - 1
        else:
            i = i + 1 
            
    return listNormal

l_ = flatten(l_1)
print(l_)