package com.listapp.todolistapp1;

import java.sql.Date;

@Entity
public class User {

    
    private int id;
    private String description;
    private String status;
    private Date date;
    private int userId;
       
        public User(int id,String description, String status, Date date,int userId){
            this.id=id;
            this.description=description;
            this.status=status;
            this.date=date;
        this.userId=userId;
    }

    public int getId() 
        {
            return id;
        }

        public void setId(int id)
        {
            this.id=id;
        }

        public String getDescription()
        {
            return description;
        }

        public void setDescription(String description)
        {
            this.description=description;
        }

        public String getStatus()
        {
            return status;
        }

        public void setStatus(String status)
        {
            this.status=status;
        }

        public Date getDate()
        {
            return date;
        }

        public void setDate(Date date)
        {
            this.date=date;
        }

        public int getUserId()
        {
            return userId;
        }

        public void setUserId(int userId)
        {
            this.userId=userId;
        }

        public String toString()
        {
            return "User [id=" + id + ", description=" + description + ", status=" + status + ", date=" + date + ", userId=" + userId + "]";
        }
     

}
