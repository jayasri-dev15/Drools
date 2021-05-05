[condition][]There is an {Customer} that=${Customer!lc}:${Customer!age}()=instance(age=="{20}")
[consequence][]update {Customer}=System.out.println("{Customer}" + "discount")=System.out.println("{discount}")
