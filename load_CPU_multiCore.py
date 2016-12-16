# -*- coding: utf-8 -*-
"""
Created on Thu Dec 01 16:15:38 2016

@author: gueriale
"""

import random
import time
from multiprocessing import Process,cpu_count
import sys



global exitFlag
exitFlag = False

taill_rand1 = 10000
taill_rand2 = 100000
    
def CPU_LOAD( threadName ):  
    global exitFlag
    print threadName    
    while  not exitFlag:
        try:
            i = random.randint(0,taill_rand2)
            j = random.randint(0,taill_rand1)
            while i != j:
                i = random.randint(0,taill_rand2)
            t = random.uniform(0,1)
            print t
            time.sleep(t)
        except KeyboardInterrupt:
            sys.exit(0)
            print 'fin thread: '+str(threadName)+'\n'
    sys.exit(0)

       
if __name__ == '__main__':     
#    try:
    i = cpu_count()
    print i
    for a in range(i-1):
        print "1:"+str(a)+'\n'     
        Process(target=CPU_LOAD,args=(str(a+1),)).start()
        print 'start tread: '+str(a+1)+'\n'
#    except:
#       print "Error: unable to start thread"
    try:
        while True:
            time.sleep(1000)
    except KeyboardInterrupt:
        print 'fin'
    finally:
        for a in range(i):
            Process(target=CPU_LOAD,args=(str(a+1),)).terminate()