# Week11_-Final_Project

# README - CRUD Menu-Driven Application

## **Project Overview**
Develop a menu-driven application to demonstrate CRUD (Create, Read, Update, Delete) operations on a project database, interfacing with a MySQL database.

## **Background**
- Initial setup includes MySQL connection and record insertion.
- Users can retrieve either a list of or individual project records.
- Progression aims to cover all CRUD operations, with emphasis on the recent additions: Update and Delete.

## **Objectives**
1. **Update Operation**: Modify details via SQL UPDATE.
2. **Delete Operation**: Erase projects and related child rows with SQL DELETE.
3. **Foreign Key Management**: Utilize ON DELETE CASCADE for foreign key child rows.
4. **Feedback**: Use return from `PreparedStatement.executeUpdate()` to verify row modifications.

## **Exercise Details**
### 1. **Update Project Details**
Focus on updating a project row, with scope for enhancements like materials, categories, or step modifications.

### 2. **Menu Application Changes (`ProjectsApp.java`)**
- Add a new menu selection for updates.
- Modify switch-case for method call.
- Design a method for user modifications and apply the changes via the project service.

### 3. **Project Service Updates (`ProjectService.java`)**
- Employ DAO to amend project details.
- Return modified details to the user.
- Implement error handling for missing projects.

### 4. **Delete Operation Integration**
#### **Preparation**
- Confirm ON DELETE CASCADE functionality.
- Input child records manually, using DBeaver or MySQL CLI.

#### **Menu Application Changes (`ProjectsApp.java`)**
- Integrate "5) Delete a project" to menu.
- In switch, add case 5 for `deleteProject()`.
- Display project list, gather project ID input, and handle deletion or reset operations as needed.

#### **Service Adjustments (`ProjectService.java`)**
- Use DAO's `deleteProject()`.
- Handle exceptions for non-existent projects.

#### **DAO Adjustments (`ProjectDao.java`)**
- Formulate SQL DELETE with placeholders.
- Handle connection setup, execution, and validation.

## **Testing**
### Update
- Run app without choosing a project to update. Document error handling, capturing console output.
  
### Deletion
1. **Invalid ID Test**: Delete with a wrong ID and note the error.
2. **Actual Deletion**: Use a valid project ID and ensure its removal.

Ensure both Update and Delete operations are integrated properly for a holistic CRUD experience.

## **Upcoming Features**
Additional functionalities and improvements are on the horizon.

## **Solutions Section**
Consult the 'Solutions' section in the provided documentation for challenges faced during the exercises.

## **Conclusion**
Thanks for contributing to this CRUD application project. Your input is invaluable for refining the system.
