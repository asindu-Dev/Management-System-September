package lk.acpt.memorymanagement.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import lk.acpt.memorymanagement.db.Database;
import lk.acpt.memorymanagement.dto.EmployeeDto;
import lk.acpt.memorymanagement.service.EmployeeService;
import lk.acpt.memorymanagement.service.impl.EmployeeServiceImpl;

import java.util.ArrayList;

public class EmployeeController {
    @FXML
    private TextField txtaddress;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtposition;
    

    @FXML
    void save(ActionEvent event) {
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String address = txtaddress.getText();
        String position = txtposition.getText();

        EmployeeService service = new EmployeeServiceImpl();
        boolean saved = service.saveEmployee(new EmployeeDto(id, name, address, position));

        if (saved) {
            System.out.println("Saved successfully");
        } else {
            System.out.println("Saved fail");
        }

    }

    public void cancel(ActionEvent actionEvent) {

    }

    public void update(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String address = txtaddress.getText();
        String position = txtposition.getText();

        EmployeeService service = new EmployeeServiceImpl();

        boolean is_updated = service.updateEmployee(new EmployeeDto(id, name, address, position));

        if (is_updated) {
            System.out.println("Update successfully");
        } else {
            System.out.println("Update fail");
        }


    }

    public void delete(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String address = txtaddress.getText();
        String position = txtposition.getText();

        EmployeeService service = new EmployeeServiceImpl();

        boolean is_deleted = service.updateEmployee(new EmployeeDto(id, name, address, position));

        if (is_deleted) {
            System.out.println("Delete successfully");
        } else {
            System.out.println("Delete fail");
        }


    }

    public void getall(ActionEvent actionEvent) {
        EmployeeService service = new EmployeeServiceImpl();
        ArrayList<EmployeeDto> allEmployee = service.getAllEmployee();

        for (int i=0;i< Database.employees.size(); i++){
            System.out.println(allEmployee.get(i).getId_num());
            System.out.println(allEmployee.get(i).getName());
            System.out.println(allEmployee.get(i).getAddress());
            System.out.println(allEmployee.get(i).getPosition());

        }



    }
}



