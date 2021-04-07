package tn.windata.gestibank.model.helper;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<String> {

	@LastModifiedDate
	private Date DateModification;

	@CreatedDate
	private Date DateAjout;


	
	public Date getDateModification() {
		return DateModification;
	}

	public void setDateModification(Date dateModification) {
		DateModification = dateModification;
	}

	public Date getDateAjout() {
		return DateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		DateAjout = dateAjout;
	}


}
