-- mysql test

select name
from customer
where custid not in (select custid from orders);

