# Producers and- Consumers in the Cafeteria

This project is an implementation of producer-consumer problem in a cafeteria scenario using monitors (synchronized).

In the cafetera, cookers (producers) produces different foods. 
Students are always hungry consumers waiting for their new meal.
Food is served thourough a table.

Cookers put the foods that they produce on the table and ring the bell (notify). 
If the table is full, cookers start to wait until a student warns them that there is room on the table for new food.  

Students come and take their food. If the table is empty, students start to wait hungry until a Cooker warns them 
there is food on the table.

In this sceneraio, the table is the shared resource, by Producers and Consumers. So, it is open to synchronization problems and thus it must be protected, 
otherwise anomalies are inevitable.
To do it, we regulate the access of the table using monitors or synchronized blocks.  
In this way, it is guaranteed no producer or consumer can acces the table at the same time. 
Therefore, a smooth concurrent access of food production and consumtion is maintained.

In short, the idea is "don't touch the table at the same time :-)". Or better, "no concurrent access to the shared resource".
