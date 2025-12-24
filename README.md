# Acme_Pipe

1. Project Overview

This is a production-grade application built for Acme Pipe Industries. Unlike a standard academic project, this software
is designed for real-world deployment on factory floors and field sites.

    Primary Target: Android Mobile (Priority for portability).

    Secondary Target: Windows Desktop (.exe).

2. Professional Objectives

This project serves three core purposes:

    Production Utility: Providing a functional tool for Acme Pipe Industries to manage workflows, client data, and industrial calculations in real-time.

    Iterative Development: Built to handle a lifecycle of feedback, updates, and multiple versions based on actual user testing.

    Industry-Level Showcase: Demonstrating high-level proficiency in JavaFX, cross-platform architecture, and professional documentation.

3. Brand Identity & UI/UX

The application utilizes a high-contrast, modern industrial color palette.

    Primary (Red): Action items, branding, and critical alerts.

    Secondary (Black): Backgrounds and primary navigation.

    Tertiary (Grey): Secondary buttons and text fields.

4. Core Features
   Module Description
   Calculator Industry-specific tools for pipe measurements, weights, and pressure ratings.
   Client Data A CRM-style interface to manage customer contact info and history.
   Work Order Digital forms for creating, tracking, and updating active industrial jobs.
5. Development Philosophy & Standards

To ensure this app is "Job Ready" and "Production Ready," we adhere to the following:

    Clean Code: Modular architecture to allow for easy updates when the business needs change.

    Version Control: Rigorous use of Git for tracking features, bug fixes, and user feedback iterations.

    Scalability: Responsive UI layouts that adapt from mobile screens to desktop monitors without breaking.

    User-Centric Design: Features are prioritized based on direct feedback from the end-user (Acme Pipe Industries staff).

5. System Logic & Integration

To maximize efficiency for Acme Pipe Industries, the modules are interconnected rather than standing as isolated tools:

    Calculator (The Core Engine): Supports "Short Length" (initial focus) and "Long Length" pipe calculations. All calculations are stored in a History log for auditing and quick retrieval.

    Work Order Integration: Users can "Promote" a calculation directly into a Work Order. This auto-populates the industrial specs and links them to a selected client, reducing manual entry errors.

    Client Management: A robust module to add, update, and view client history, serving as the "Source of Truth" for the Work Order system.

    Exportability: Work Orders are designed to be generated in a printable format (PDF) for physical record-keeping and client delivery.

6. Development Strategy

This project follows an iterative, industry-standard development cycle:

    Phase 1: Logic & Modeling - Defining the Client, WorkOrder, and Calculation Java objects.

    Phase 2: The Calculator Engine - Implementing the "Short Length" math logic and history tracking.

    Phase 3: Persistent Storage - Integrating SQLite to ensure data survives app restarts.

    Phase 4: UI/UX (JavaFX) - Building the industrial Red/Black/Grey interface.

    Phase 5: Output - Implementing the PDF generation engine for printable work orders.

