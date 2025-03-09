the execution of the application starts from main() in the springboot 
@SpringBootApplication marks the main class of the application
@SpringBootApplication comprises of 3 annotation
  1. @Configuration
  2. @EnableAutoConfiguration
  3. @ComponentScan
     
// write details of each of the annotations

@RequestBody
------------- 
@RequestBody annotation maps the HttpRequest body to a transfer or domain object,enabling automatic deserialization 

//serialization
the process of converting an object into a format that can be stored or transmitted often done by converting the object into a text or binary format, such as JSON or XML. 
//Deserialization
opposite to serialization

@PathVariable
--------------
@PathVariable is used on method argument to bind the value of a URI template variable to a method argument.

when we want to pass different URI to the method argument (URI is different from method argument):
--------------------------------------------------------------------------------------------------

@GetMapping("/get/{JobSeekerId}")
	public Optional<JobSeeker> getJobSeekerByIdContro(@PathVariable("JobSeekerId") long Id){
		Optional<JobSeeker> JobSeekerById = jobSeekerService.getJobSeekerById(Id);
		return JobSeekerById;
	}


