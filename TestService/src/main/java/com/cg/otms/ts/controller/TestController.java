package com.cg.otms.ts.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.otms.ts.dto.Test;
import com.cg.otms.ts.service.TestService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class TestController
{
	@Autowired
	TestService testService;
	public void setTestService(TestService testService)
	{
		this.testService=testService;
	}
	
   @GetMapping("/getTests")
   public List<Test> getTests()
   {
	   return testService.getTests();
   }

   @PostMapping(value="/addTest",consumes="application/json")
   public ResponseEntity<String> insertTest(@RequestBody()Test test)
   {
	   String message="Test Inserted Successfully";
	   if(testService.insertTest(test)==null)
		   message="Test Insertion Failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
   }
   
   @PutMapping(value="/updateTest",consumes="application/json")
   public String updateBook(@RequestBody()Test test)
   {
	   String message=testService.updateTest(test);
	   return message;
   }
   
   @DeleteMapping("/deleteTest/{testId}")
   public String deleteTest(@PathVariable int testId)
   {
	   return testService.deleteTest(testId); 
   }
}
