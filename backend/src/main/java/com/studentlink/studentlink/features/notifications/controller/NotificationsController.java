package com.studentlink.studentlink.features.notifications.controller;

import com.studentlink.studentlink.features.authentication.model.AuthenticationUser;
import com.studentlink.studentlink.features.notifications.model.Notification;
import com.studentlink.studentlink.features.notifications.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationsController {
    private final NotificationService notificationService;

    public NotificationsController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public List<Notification> getUserNotifications(@RequestAttribute("authenticatedUser") AuthenticationUser user) {
        return notificationService.getUserNotifications(user);
    }

    @PutMapping("/{notificationId}")
    public Notification markNotificationAsRead(@PathVariable Long notificationId) {
        return notificationService.markNotificationAsRead(notificationId);
    }
}
