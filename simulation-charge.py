# -*- coding: utf-8 -*-
"""
Created on Thu Dec 01 16:15:38 2016

@author: gueriale
"""

import random
import time
import threading
import sys

exitFlag = False
taill_rand1 = 10000
taill_rand2 = 100000

class myThread (threading.Thread):
    def __init__(self, threadID, name, counter):
        threading.Thread.__init__(self)
        self.threadID = threadID
        self.name = name
        self.counter = counter
    def run(self):
        print "Starting " + self.name
        CPU(self.name)
        print "Exiting " + self.name

    
def CPU( threadName ):  
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
        
try:
    thread1 = myThread(1, "Thread-1", 1)
    thread2 = myThread(2, "Thread-2", 2)
    thread1.start()
    thread2.start()   
except:
   print "Error: unable to start thread"
nom =''
while nom != "a":
    nom = raw_input("fin? ")
exitFlag = 1
exit