package com.example.listview;

public class Jobs {
    String Tittle;
    String Company_name;
    String Address;
    String salary;
    String description;

    Jobs( String t,String c, String a, String s,String d)
    {
        Tittle=t;
        Company_name=c;
        Address=a;
        salary=s;
        description=d;

    }
    String getTittle()
    {
        return Tittle;
    }

    String getCompany_name()
    {
        return Company_name;
    }
    String getAddress()
    {
        return Address;
    }

String getSalary()
{
    return salary;
}

    String getDescription()
    {
        return  description;
    }
}

