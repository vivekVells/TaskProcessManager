package corp.tech.vivek.processmonitor.cpu_info.cpu_endpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CpuInfoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // CPU device info
    private String cpuVendor;
    private String cpuModel;
    private String cpuOperatingAt;
    private Integer cpuTotalCores;
    private Integer cpuTotalSockets;
    private Integer cpuCoresPerSocket;

    // Total cpu memory usage info
    private Integer totalIdleTime;
    private Integer totalWaitTime;
    private Integer totalUserTime;
    private Integer totalCombinedTime;
    private Integer totalIrqTime;
    private Integer totalNiceTime;
    private Integer totalSysTIme;

    public CpuInfoModel() { }

    public CpuInfoModel(String cpuVendor, String cpuModel, String cpuOperatingAt, Integer cpuTotalCores, Integer cpuTotalSockets, Integer cpuCoresPerSocket, Integer totalIdleTime, Integer totalWaitTime, Integer totalUserTime, Integer totalCombinedTime, Integer totalIrqTime, Integer totalNiceTime, Integer totalSysTIme) {
        this.cpuVendor = cpuVendor;
        this.cpuModel = cpuModel;
        this.cpuOperatingAt = cpuOperatingAt;
        this.cpuTotalCores = cpuTotalCores;
        this.cpuTotalSockets = cpuTotalSockets;
        this.cpuCoresPerSocket = cpuCoresPerSocket;
        this.totalIdleTime = totalIdleTime;
        this.totalWaitTime = totalWaitTime;
        this.totalUserTime = totalUserTime;
        this.totalCombinedTime = totalCombinedTime;
        this.totalIrqTime = totalIrqTime;
        this.totalNiceTime = totalNiceTime;
        this.totalSysTIme = totalSysTIme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcpuVendor() {
        return cpuVendor;
    }

    public void setcpuVendor(String cpuVendor) {
        this.cpuVendor = cpuVendor;
    }

    public String getcpuModel() {
        return cpuModel;
    }

    public void setcpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getcpuOperatingAt() {
        return cpuOperatingAt;
    }

    public void setcpuOperatingAt(String cpuOperatingAt) {
        this.cpuOperatingAt = cpuOperatingAt;
    }

    public Integer getcpuTotalCores() {
        return cpuTotalCores;
    }

    public void setcpuTotalCores(Integer cpuTotalCores) {
        this.cpuTotalCores = cpuTotalCores;
    }

    public Integer getcpuTotalSockets() {
        return cpuTotalSockets;
    }

    public void setcpuTotalSockets(Integer cpuTotalSockets) {
        this.cpuTotalSockets = cpuTotalSockets;
    }

    public Integer getcpuCoresPerSocket() {
        return cpuCoresPerSocket;
    }

    public void setcpuCoresPerSocket(Integer cpuCoresPerSocket) {
        this.cpuCoresPerSocket = cpuCoresPerSocket;
    }

    public Integer getTotalIdleTime() {
        return totalIdleTime;
    }

    public void setTotalIdleTime(Integer totalIdleTime) {
        this.totalIdleTime = totalIdleTime;
    }

    public Integer getTotalWaitTime() {
        return totalWaitTime;
    }

    public void setTotalWaitTime(Integer totalWaitTime) {
        this.totalWaitTime = totalWaitTime;
    }

    public Integer getTotalUserTime() {
        return totalUserTime;
    }

    public void setTotalUserTime(Integer totalUserTime) {
        this.totalUserTime = totalUserTime;
    }

    public Integer getTotalCombinedTime() {
        return totalCombinedTime;
    }

    public void setTotalCombinedTime(Integer totalCombinedTime) {
        this.totalCombinedTime = totalCombinedTime;
    }

    public Integer getTotalIrqTime() {
        return totalIrqTime;
    }

    public void setTotalIrqTime(Integer totalIrqTime) {
        this.totalIrqTime = totalIrqTime;
    }

    public Integer getTotalNiceTime() {
        return totalNiceTime;
    }

    public void setTotalNiceTime(Integer totalNiceTime) {
        this.totalNiceTime = totalNiceTime;
    }

    public Integer getTotalSysTIme() {
        return totalSysTIme;
    }

    public void setTotalSysTIme(Integer totalSysTIme) {
        this.totalSysTIme = totalSysTIme;
    }

    @Override
    public String toString() {
        return "CpuInfocpuModel{" +
                "id=" + id +
                ", cpuVendor='" + cpuVendor + '\'' +
                ", cpuModel='" + cpuModel + '\'' +
                ", cpuOperatingAt='" + cpuOperatingAt + '\'' +
                ", cpuTotalCores=" + cpuTotalCores +
                ", cpuTotalSockets=" + cpuTotalSockets +
                ", cpuCoresPerSocket=" + cpuCoresPerSocket +
                ", totalIdleTime=" + totalIdleTime +
                ", totalWaitTime=" + totalWaitTime +
                ", totalUserTime=" + totalUserTime +
                ", totalCombinedTime=" + totalCombinedTime +
                ", totalIrqTime=" + totalIrqTime +
                ", totalNiceTime=" + totalNiceTime +
                ", totalSysTIme=" + totalSysTIme +
                '}';
    }
}
