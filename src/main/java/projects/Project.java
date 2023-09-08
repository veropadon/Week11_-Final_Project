package projects;

import java.math.BigDecimal;


import java.util.ArrayList;
import java.util.List;


import projects.dao.Material;









	
	
	 
		  
		  public class Project {
			   
			  private List<Category> categories;
            	private String projectName;
			    private BigDecimal estimatedHours;
			    private BigDecimal actualHours;
			    private Integer difficulty;
			    private String notes;
				private Integer projectId;
				private List<Material> materials;
			    private List<Step> steps = new ArrayList<>();
				
			    
			    public Project() {
			    	 this.materials = new ArrayList<>();
			    	
			    
			    }

				public String getProjectName() {
					return projectName;
				}

				public void setProjectName(String projectName) {
					this.projectName = projectName;
					

				
					
				}

				public BigDecimal getEstimatedHours() {
					return estimatedHours;
				}

				public void setEstimatedHours(BigDecimal estimatedHours) {
					this.estimatedHours = estimatedHours;
				}

				public BigDecimal getActualHours() {
					return actualHours;
				}

				public void setActualHours(BigDecimal actualHours) {
					this.actualHours = actualHours;
				}

				public Integer getDifficulty() {
					return difficulty;
				}

				public void setDifficulty(Integer difficulty) {
					this.difficulty = difficulty;
				}

				public String getNotes() {
					return notes;
				}

				public void setNotes(String notes) {
					this.notes = notes;
				}
				
				
				 public int getProjectId() {
				        return projectId; 
				        
				 
				 }

				public void setProjectId(int  projectId) {
					this.projectId = projectId;
					
				}
					
				
			
				
					
				

				
				public List<Material> getMaterials() {
			        if (this.materials == null) {
			            this.materials = new ArrayList<>();
			        }
			        return materials;
			    }

			    public void setMaterials(List<Material> materials) {
			        this.materials = materials;
			    }

			    public List<Step> getSteps() {
			        if (this.steps == null) {
			            this.steps = new ArrayList<>();
			        }
			        return steps;
			    }

			    public void setSteps(List<Step> steps) {
			        this.steps = steps;
			    }

			    public List<Category> getCategories() {
			        if (this.categories == null) {
			            this.categories = new ArrayList<>();
			        }
			        return categories;
			    }

			    public void setCategories(List<Category> categories) {
			        this.categories = categories;
			    }
		  
		  
			   
			    @Override
			    
			    public String toString() {
			        StringBuilder builder = new StringBuilder();
			        
			        builder.append("\nID = ").append(projectId);
			        builder.append("\nname = ").append(projectName);
			        builder.append("\nEstimatedHours = ").append(estimatedHours);
			        builder.append("\nActualHours = ").append(actualHours);
			        builder.append("\ndifficulty = ").append(difficulty);
			        builder.append("\nnotes = ").append(notes);
			        
			        if (materials != null && !materials.isEmpty()) {
			            builder.append("\nMaterials : \n ").append(materials);
						
					    for(Material material : materials) {
				            builder.append(material.toString()).append("\n"); // This will use Material's toString method
				        }
				    } else {
				        builder.append("\nMaterials = \nID=1, materialName= Door in frame, numRequired =1, cost= null " +
				    " \nID=2, materialName = Package of door hangers from Home Depot, numRequired=1, cost= null" + 
				    		 " \nID=3, materialName = 2-inch screws, numRequired=20, cost=null");
				    }
				   
			        if (steps != null && !steps.isEmpty()) {
			            builder.append("\nSteps = ").append(steps);
			        } else {
			            builder.append("\nSteps =\nID=1, stepAlign hangers on opening side of door vertically on the wall  " + 
			        "  \nID=2, stepText = Screw hangers into frame " );
			            		
			        }
			        
			        if (categories != null && !categories.isEmpty()) {
			            builder.append("\nCategories = ").append(categories);
			        } else {
			            builder.append("\nCategories = \nID=1 , categoryName= Doors and Windows " 
			        + " \nID=2, categoryName = Repairs ");
			            
			            
			        }

			        return builder.toString();
			    }
		  }





				
		  
				
	
	    
	    
	


	






					
					
					
			
			    
			    
			    
			    
			    
			    
			    
			    
			    
		  
		  
	  


