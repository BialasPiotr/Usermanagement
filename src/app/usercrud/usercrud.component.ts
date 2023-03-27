import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-usercrud',
  templateUrl: './usercrud.component.html',
  styleUrls: ['./usercrud.component.css']
})
export class UsercrudComponent {

  UserArray : any[] = [];
  isResultLoaded = false;
  isUpdateFormActive = false;

  username: string = " ";
  useremail: string = " ";
  userpassword: string = " ";
  userbirthdate: string = " ";
  userphone: string = " ";

  currentUserID = " ";


  constructor(private http: HttpClient)
  {
    this.getAllUser();
  }
  getAllUser()
  {
    
    this.http.get("http://localhost:8080/api/v1/user//getAllUser")
  
    .subscribe((resultData: any)=>
    {
        this.isResultLoaded = true;
        console.log(resultData);
        this.UserArray = resultData;
    });
  }
 
  register()
  {
  
    let bodyData = {
      "name" : this.username,
      "password" : this.userpassword,
      "email" : this.useremail,
      "birthdate" : this.userbirthdate,
      "phone" : this.userphone
    };
 
    this.http.post("http://localhost:8080/api/v1/user/save",bodyData).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("User Registered Successfully")
        this.getAllUser();
        this.username = '';
        this.userpassword = '';
        this.userphone  = '';
        this.useremail = '';
        this.userbirthdate = '';
    });
  }
 
  setUpdate(data: any)
  {
   this.username = data.name;
   this.useremail = data.email;
   this.userphone = data.phone;
   this.userpassword = data.password;
   this.userbirthdate = data.birthdate;
  this.currentUserID = data.id;
  }
 
  UpdateRecords()
  {
    let bodyData = {
      "userid" : this.currentUserID,
      "name" : this.username,
      "email" : this.useremail,
      "password" : this.userpassword,
      "birthdate" : this.userbirthdate,
      "phone" : this.userphone
    };
    
    this.http.put("http://localhost:8080/api/v1/user/update",bodyData,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("User Registered Updated")
        this.getAllUser();
        this.username = '';
        this.userpassword = '';
        this.userphone  = '';
        this.useremail = '';
        this.userbirthdate = '';
    });
  }
  save()
  {
    if(this.currentUserID == '')
    {
        this.register();
    }
      else
      {
       this.UpdateRecords();
      }      
 
  }
 
 
  setDelete(data: any)
  {
    
    
    this.http.delete("http://localhost:8080/api/v1/user/delete"+ "/"+ data.id).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("User Deleted")
        this.getAllUser();
  
    });
 
  }
}
 
