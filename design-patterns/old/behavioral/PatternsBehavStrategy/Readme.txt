STRATEGY


We should use this pattern when we have the same "if" block
in more then one method. 

We should create so many different classes of Strategy as we have 
methods with with "if" block. Every Strategy is responsible for
one feature.

Pattern State is very similar to Strategy. This is the same but
from another point of view:
- Strategy: we have so many Strategies as we had method with "if" block;
- State: we have so many States as we had "if" in "if" blocks
So pattern depends on what should be dynamically changed: count of "if" or 
methods with "if".

For instance:
We have following classes:
- abstract class Strategy with method execute(): it`s implementations set
specified values. For instance LabelStrategy (sets label to item) or 
DescriptionStrategy (sets description to item);
- class Context with method executeStrategy(): this method executes Strategy
which was set here as constructor attribute.
