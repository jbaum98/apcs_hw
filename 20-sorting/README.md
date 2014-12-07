Insertion Sort
================
Isort applies `shift` `n` times, each time with a smaller parameter. The first call is `n`, then `n-1`, until `1` and `0`, therefore the run time is `1 + 2 + ... + n-1 + n` or `n(n-1)/2` which is quadratic in `n`.

Shift
-----
It traverses down the first `index` elements, so it's run time is just `index`.

Selection Sort
===============
We must find the min for each element in the list, so it will be `n + n-1 + ... + 2 + 1` which is also `n(n-1)/2` which is quadratic in `n`.

Finding the min
----------------
It traverses up the list starting from the divider, so `n-divider`

Bubble Sort
===========
It also features a main loop with an inner loop starting from the counter of the outer, that creates the "1 + 2..." pattern, so it will have the same runtime.
