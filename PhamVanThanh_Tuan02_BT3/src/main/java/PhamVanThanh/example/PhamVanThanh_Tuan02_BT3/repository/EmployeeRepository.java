package PhamVanThanh.example.PhamVanThanh_Tuan02_BT3.repository;


import PhamVanThanh.example.PhamVanThanh_Tuan02_BT3.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}