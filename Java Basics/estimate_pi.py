# Given a random number generator, which generates numbers between 0 and 1 uniformly.
# Estimate PI!

#Hint: Think of a circle and a square

import random
import math


def estimate_pi(n):
    
    total_points=0
    circle_points=0
    
    for _ in range(n):
        point_x=random.uniform(0,1)
        point_y=random.uniform(0,1)
        
        distance_to_origin=math.sqrt(point_x*point_x+point_y*point_y)
        if distance_to_origin <1:
            circle_points+=1
        total_points+=1
        
    return 4*circle_points/total_points
    

print(estimate_pi(10000000))
