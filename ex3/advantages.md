This is implmenation adds an Observer pattern for the view components.

I think that this is the best of the three Cash Register applications as it is the most extensible. The observers extend an abstract class containg the required methods, so adding a new on is fairly easy as it would just need to extend the already existing class. Additionally adding the view components to the cash register is also fairly simple as there is a list of observers it would just need to be added to in order to function. Providing a notify function makes it much easier to send these signals to all observers at once.

The disadvantage with this method is that it is slightly more difficult to create and can sometimes be unneccesary for applications that do not change often such as the cash register. 