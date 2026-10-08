package com.studentlink.studentlink.features.notifications.repository;

import com.studentlink.studentlink.features.authentication.model.AuthenticationUser;
import com.studentlink.studentlink.features.notifications.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByRecipient(AuthenticationUser recipient);
    List<Notification> findByRecipientOrderByCreationDateDesc(AuthenticationUser user);
}
