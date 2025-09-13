# StudentLink 🚀

StudentLink is a campus-focused networking platform that helps college students connect, collaborate on projects, and share announcements or ads within their own campus community.

---

## ✨ Features
- 🤝 **Campus Networking** – Find and connect with other students.
- 🧑‍💻 **Team Collaboration** – Work together on projects or events.
- 📢 **Ads & Announcements** – Post and discover opportunities, meetups, or campus gigs.

---

## 🛠️ Tech Stack
- **Backend**: Java + Spring Boot  
- **Frontend**: React + Vite  
- **Database**: MySQL (Port **3307**)  
- **Email Service**: MailHog (Port **8025**)  
- **Containerization**: Docker + Docker Compose

---

## 🚀 Getting Started

### 1️⃣ Clone the Repo
```bash
git clone https://github.com/Vedant-Khope/StudentLink.git
cd StudentLink
2️⃣ Start Backend Services

Make sure Docker is installed and running.

cd backend
docker-compose up


This starts:

MySQL on port 3307

MailHog for email verification on port 8025

Run the Backend

Ensure the correct Java version is installed, then:

./gradlew bootrun

4️⃣ Launch the Frontend

Open a new terminal:

cd frontend
npm install
npm run dev

💡 Tips

1) Check Docker Desktop or run docker ps to confirm containers are live.

2) Visit http://localhost:8025
 to view verification emails.

3) The frontend dev server typically runs on http://localhost:5173
 (check your terminal for confirmation).
