package br.com.sistemaWeb.vefel.models.bd_oab;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "LoginUsers")
public class LoginUsers implements Serializable {

    private static final long serialVersionUID = 1788042045307584451L;

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Password")
    private String password;

    @Column(name = "IsActive")
    private String isActive;

    @Column(name = "OriginalID")
    private Long originalID;

    @Column(name = "UserID", nullable = false, unique = true)
    private String userID;

    @Column(name = "UserName")
    private String userName;

    @Column(name = "EntitiID")
    private Long entitiID;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "FinalDate")
    private LocalDateTime finalDate;

    @Column(name = "CanAddFilter")
    private String canAddFilter;

    @Column(name = "CanChangeFilter")
    private String canChangeFilter;

    @Column(name = "CanViewFilter")
    private String canViewFilter;

    @Column(name = "Filter")
    private Long filter;

    @Column(name = "Sharing")
    private String sharing;

    @Column(name = "OrganizationalView")
    private Long organizationalView;

    @Column(name = "Expired")
    private String expired;

    @Column(name = "ExpiresOn")
    private LocalDateTime expiresOn;

    @Column(name = "TryCount")
    private Long tryCount;

    @Column(name = "FinalHour")
    private LocalDateTime finalHour;

    @Column(name = "startHour")
    private LocalDateTime startHour;

    @Column(name = "DateBlocked")
    private LocalDateTime dateBlocked;

    @Column(name = "ViewConfiguration")
    private String viewConfiguration;

    @Column(name = "CreatedBy")
    private Long createdBy;

    @Column(name = "CreatedOn")
    private LocalDateTime createdOn;

    @Column(name = "UpdatedBy")
    private Long updatedBy;

    @Column(name = "UpdatedOn")
    private LocalDateTime updatedOn;

    @Column(name = "UpdatedByInterface")
    private Long updatedByInterface;

    @Column(name = "UpdatedOnInterface")
    private LocalDateTime updatedOnInterface;

    @Column(name = "PasswordUpdatedOn")
    private LocalDateTime passwordUpdatedOn;

    @Column(name = "CanViewMultiIdiom")
    private String canViewMultiIdiom;

    @Column(name = "CodigoAtivacao")
    private String codigoAtivacao;

    @Column(name = "ScaleWork")
    private Long scaleWork;

    @Column(name = "CLI_Departamento")
    private String cliDepartamento;

    @Column(name = "CLI_GrupoAcesso")
    private String cliGrupoAcesso;

    @Column(name = "InactivationDate")
    private LocalDateTime inactivationDate;

    @Column(name = "PassNeverExpires")
    private String passNeverExpires;

    @Column(name = "LastLogin")
    private LocalDateTime lastLogin;

    @Column(name = "UserIdiom")
    private Long userIdiom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Long getOriginalID() {
        return originalID;
    }

    public void setOriginalID(Long originalID) {
        this.originalID = originalID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getEntitiID() {
        return entitiID;
    }

    public void setEntitiID(Long entitiID) {
        this.entitiID = entitiID;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDateTime finalDate) {
        this.finalDate = finalDate;
    }

    public String getCanAddFilter() {
        return canAddFilter;
    }

    public void setCanAddFilter(String canAddFilter) {
        this.canAddFilter = canAddFilter;
    }

    public String getCanChangeFilter() {
        return canChangeFilter;
    }

    public void setCanChangeFilter(String canChangeFilter) {
        this.canChangeFilter = canChangeFilter;
    }

    public String getCanViewFilter() {
        return canViewFilter;
    }

    public void setCanViewFilter(String canViewFilter) {
        this.canViewFilter = canViewFilter;
    }

    public Long getFilter() {
        return filter;
    }

    public void setFilter(Long filter) {
        this.filter = filter;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public Long getOrganizationalView() {
        return organizationalView;
    }

    public void setOrganizationalView(Long organizationalView) {
        this.organizationalView = organizationalView;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public LocalDateTime getExpiresOn() {
        return expiresOn;
    }

    public void setExpiresOn(LocalDateTime expiresOn) {
        this.expiresOn = expiresOn;
    }

    public Long getTryCount() {
        return tryCount;
    }

    public void setTryCount(Long tryCount) {
        this.tryCount = tryCount;
    }

    public LocalDateTime getFinalHour() {
        return finalHour;
    }

    public void setFinalHour(LocalDateTime finalHour) {
        this.finalHour = finalHour;
    }

    public LocalDateTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalDateTime startHour) {
        this.startHour = startHour;
    }

    public LocalDateTime getDateBlocked() {
        return dateBlocked;
    }

    public void setDateBlocked(LocalDateTime dateBlocked) {
        this.dateBlocked = dateBlocked;
    }

    public String getViewConfiguration() {
        return viewConfiguration;
    }

    public void setViewConfiguration(String viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getUpdatedByInterface() {
        return updatedByInterface;
    }

    public void setUpdatedByInterface(Long updatedByInterface) {
        this.updatedByInterface = updatedByInterface;
    }

    public LocalDateTime getUpdatedOnInterface() {
        return updatedOnInterface;
    }

    public void setUpdatedOnInterface(LocalDateTime updatedOnInterface) {
        this.updatedOnInterface = updatedOnInterface;
    }

    public LocalDateTime getPasswordUpdatedOn() {
        return passwordUpdatedOn;
    }

    public void setPasswordUpdatedOn(LocalDateTime passwordUpdatedOn) {
        this.passwordUpdatedOn = passwordUpdatedOn;
    }

    public String getCanViewMultiIdiom() {
        return canViewMultiIdiom;
    }

    public void setCanViewMultiIdiom(String canViewMultiIdiom) {
        this.canViewMultiIdiom = canViewMultiIdiom;
    }

    public String getCodigoAtivacao() {
        return codigoAtivacao;
    }

    public void setCodigoAtivacao(String codigoAtivacao) {
        this.codigoAtivacao = codigoAtivacao;
    }

    public Long getScaleWork() {
        return scaleWork;
    }

    public void setScaleWork(Long scaleWork) {
        this.scaleWork = scaleWork;
    }

    public String getCliDepartamento() {
        return cliDepartamento;
    }

    public void setCliDepartamento(String cliDepartamento) {
        this.cliDepartamento = cliDepartamento;
    }

    public String getCliGrupoAcesso() {
        return cliGrupoAcesso;
    }

    public void setCliGrupoAcesso(String cliGrupoAcesso) {
        this.cliGrupoAcesso = cliGrupoAcesso;
    }

    public LocalDateTime getInactivationDate() {
        return inactivationDate;
    }

    public void setInactivationDate(LocalDateTime inactivationDate) {
        this.inactivationDate = inactivationDate;
    }

    public String getPassNeverExpires() {
        return passNeverExpires;
    }

    public void setPassNeverExpires(String passNeverExpires) {
        this.passNeverExpires = passNeverExpires;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Long getUserIdiom() {
        return userIdiom;
    }

    public void setUserIdiom(Long userIdiom) {
        this.userIdiom = userIdiom;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LoginUsers other = (LoginUsers) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
