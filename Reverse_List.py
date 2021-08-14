#Verilen listenin içindeki elemanları tersine döndüren bir fonksiyon yazın. Eğer listenin içindeki elemanlar da liste içeriyorsa onların elemanlarını da tersine döndürün.

l_1 = [[1, 2], [3, 4], [5, 6, 7]]

def reverse_list(l_):
    
    if not isinstance(l_, list):
            return l_
        
    l_.reverse()
    
    for i in l_:
        i = reverse_list(i)
    
    return l_

print(reverse_list(l_1))